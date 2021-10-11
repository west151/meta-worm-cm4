FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://80-wired.network \
    file://wlan.network \
"

FILES_${PN} += " \
    ${sysconfdir}/systemd/network/80-wired.network \
    ${sysconfdir}/systemd/network/wlan.network \
"

do_install_append() {
    install -d ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/80-wired.network ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/wlan.network ${D}${sysconfdir}/systemd/network
}
