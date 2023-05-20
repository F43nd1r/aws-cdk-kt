@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.certificatemanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate
import software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps
import software.constructs.Construct

public fun Construct.dnsValidatedCertificate(
  id: String,
  props: DnsValidatedCertificateProps,
  initializer: DnsValidatedCertificate.() -> Unit = {},
): DnsValidatedCertificate = DnsValidatedCertificate(this, id, props).apply(initializer)
