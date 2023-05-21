package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl
import software.amazon.awscdk.services.cloudfront.CfnOriginAccessControlProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOriginAccessControl(
  id: String,
  props: CfnOriginAccessControlProps,
  initializer: CfnOriginAccessControl.() -> Unit = {},
): CfnOriginAccessControl = CfnOriginAccessControl(this, id, props).apply(initializer)
