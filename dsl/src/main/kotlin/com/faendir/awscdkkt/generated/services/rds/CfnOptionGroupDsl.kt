package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnOptionGroup
import software.amazon.awscdk.services.rds.CfnOptionGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOptionGroup(
  id: String,
  props: CfnOptionGroupProps,
  initializer: @AwsCdkDsl CfnOptionGroup.() -> Unit = {},
): CfnOptionGroup = CfnOptionGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOptionGroup(id: String, initializer: @AwsCdkDsl
    CfnOptionGroup.Builder.() -> Unit = {}): CfnOptionGroup = CfnOptionGroup.Builder.create(this,
    id).apply(initializer).build()
