SUMMARY = "Libetnaviv"
DESCRIPTION = ""
LICENSE = "MIT"
inherit autotools pkgconfig distro_features_check

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

LIC_FILES_CHKSUM = "file://src/etna.h;md5=390b1cc5e59ed226629eb47fbf25aa07"

SRCREV = "59170afe51b26468d0609474db068d87b093eb13"
SRC_URI = "git://github.com/xobs/libetnaviv.git;branch=master;protocol=http \
    file://libetnaviv.patch \
    "

S = "${WORKDIR}/git"

EXTRA_OECONF += "--with-galcore-include=${S}/src"
