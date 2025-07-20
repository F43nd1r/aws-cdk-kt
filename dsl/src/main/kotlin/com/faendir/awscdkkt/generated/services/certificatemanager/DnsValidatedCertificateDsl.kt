@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.certificatemanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate
import software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps
import software.constructs.Construct

@Deprecated(message = "software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate is deprecated in CDK.")
@Generated
public fun Construct.dnsValidatedCertificate(
  id: String,
  props: DnsValidatedCertificateProps,
  initializer: @AwsCdkDsl DnsValidatedCertificate.() -> Unit = {},
): DnsValidatedCertificate = DnsValidatedCertificate(this, id, props).apply(initializer)

@Deprecated(message = "software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate is deprecated in CDK.")
@Generated
public fun Construct.buildDnsValidatedCertificate(id: String, initializer: @AwsCdkDsl DnsValidatedCertificate.Builder.() -> Unit = {}): DnsValidatedCertificate = DnsValidatedCertificate.Builder.create(this, id).apply(initializer).build()
