SUMMARY = "OpenEmbedded Image Creator (wic) standalone CLI"
HOMEPAGE = "https://github.com/twoerner/wic"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.GPL-2.0-only;md5=4ee23c52855c222cba72583d301d2338"

SRC_URI = "git://github.com/twoerner/wic.git;branch=master;protocol=https"
SRCREV = "c9305099546888d17b33c16e98bb2012e36d734a"

inherit python_hatchling

RDEPENDS:${PN} += " \
    python3-core \
    python3-json \
    python3-logging \
    python3-misc \
    "

BBCLASSEXTEND = "native nativesdk"
