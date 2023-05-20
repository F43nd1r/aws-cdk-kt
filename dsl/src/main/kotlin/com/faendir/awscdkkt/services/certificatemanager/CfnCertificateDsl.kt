@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.certificatemanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.certificatemanager.CfnCertificate
import software.amazon.awscdk.services.certificatemanager.CfnCertificateProps
import software.constructs.Construct

public fun Construct.cfnCertificate(
  id: String,
  props: CfnCertificateProps,
  initializer: CfnCertificate.() -> Unit = {},
): CfnCertificate = CfnCertificate(this, id, props).apply(initializer)
