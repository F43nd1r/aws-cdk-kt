@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnCACertificate
import software.amazon.awscdk.services.iot.CfnCACertificateProps
import software.constructs.Construct

public fun Construct.cfnCACertificate(
  id: String,
  props: CfnCACertificateProps,
  initializer: CfnCACertificate.() -> Unit = {},
): CfnCACertificate = CfnCACertificate(this, id, props).apply(initializer)
