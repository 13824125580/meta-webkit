require wpebackend-fdo.inc

SRC_URI = "https://wpewebkit.org/releases/${PN}-${PV}.tar.xz"
SRC_URI[md5sum] = "481a67db2bac28b4d28a9654b3eb92f2"
SRC_URI[sha256sum] = "76a95cb7b597618600ac8d69147adf7dd922121acab2725f6ed99ca5b743eaba"

S = "${WORKDIR}/${PN}-${PV}"
