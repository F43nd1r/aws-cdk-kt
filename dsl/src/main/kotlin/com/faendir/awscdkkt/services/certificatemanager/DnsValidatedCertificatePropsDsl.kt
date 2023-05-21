package com.faendir.awscdkkt.services.certificatemanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps

@Generated
public fun dnsValidatedCertificateProps(initializer: DnsValidatedCertificateProps.Builder.() -> Unit
    = {}): DnsValidatedCertificateProps =
    DnsValidatedCertificateProps.builder().apply(initializer).build()
