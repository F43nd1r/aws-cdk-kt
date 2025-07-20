package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnOriginAccessControl.() -> Unit = {},
): CfnOriginAccessControl = CfnOriginAccessControl(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOriginAccessControl(id: String, initializer: @AwsCdkDsl CfnOriginAccessControl.Builder.() -> Unit = {}): CfnOriginAccessControl = CfnOriginAccessControl.Builder.create(this, id).apply(initializer).build()
