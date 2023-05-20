@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
