package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnTrafficDistributionGroup
import software.amazon.awscdk.services.connect.CfnTrafficDistributionGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTrafficDistributionGroup(
  id: String,
  props: CfnTrafficDistributionGroupProps,
  initializer: @AwsCdkDsl CfnTrafficDistributionGroup.() -> Unit = {},
): CfnTrafficDistributionGroup = CfnTrafficDistributionGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTrafficDistributionGroup(id: String, initializer: @AwsCdkDsl
    CfnTrafficDistributionGroup.Builder.() -> Unit = {}): CfnTrafficDistributionGroup =
    CfnTrafficDistributionGroup.Builder.create(this, id).apply(initializer).build()
