package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVerifiedAccessGroup(
  id: String,
  props: CfnVerifiedAccessGroupProps,
  initializer: @AwsCdkDsl CfnVerifiedAccessGroup.() -> Unit = {},
): CfnVerifiedAccessGroup = CfnVerifiedAccessGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVerifiedAccessGroup(id: String, initializer: @AwsCdkDsl
    CfnVerifiedAccessGroup.Builder.() -> Unit = {}): CfnVerifiedAccessGroup =
    CfnVerifiedAccessGroup.Builder.create(this, id).apply(initializer).build()
