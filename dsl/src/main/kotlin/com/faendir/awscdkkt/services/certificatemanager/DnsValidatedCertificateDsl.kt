@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.services.certificatemanager

import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate
import software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps
import software.constructs.Construct

@Deprecated(message =
    "software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate is deprecated in CDK.")
@Generated
public fun Construct.dnsValidatedCertificate(
  id: String,
  props: DnsValidatedCertificateProps,
  initializer: DnsValidatedCertificate.() -> Unit = {},
): DnsValidatedCertificate = DnsValidatedCertificate(this, id, props).apply(initializer)
