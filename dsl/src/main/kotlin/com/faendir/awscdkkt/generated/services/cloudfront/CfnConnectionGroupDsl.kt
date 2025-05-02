package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnConnectionGroup
import software.amazon.awscdk.services.cloudfront.CfnConnectionGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConnectionGroup(
  id: String,
  props: CfnConnectionGroupProps,
  initializer: @AwsCdkDsl CfnConnectionGroup.() -> Unit = {},
): CfnConnectionGroup = CfnConnectionGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConnectionGroup(id: String, initializer: @AwsCdkDsl
    CfnConnectionGroup.Builder.() -> Unit = {}): CfnConnectionGroup =
    CfnConnectionGroup.Builder.create(this, id).apply(initializer).build()
