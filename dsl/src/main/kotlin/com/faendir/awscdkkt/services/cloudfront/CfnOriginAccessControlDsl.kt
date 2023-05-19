@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl
import software.amazon.awscdk.services.cloudfront.CfnOriginAccessControlProps
import software.constructs.Construct

public fun Construct.cfnOriginAccessControl(
  id: String,
  props: CfnOriginAccessControlProps,
  initializer: CfnOriginAccessControl.() -> Unit = {},
): CfnOriginAccessControl = CfnOriginAccessControl(this, id, props).apply(initializer)
