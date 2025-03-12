package com.faendir.awscdkkt.generated.services.gameliftstreams

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup
import software.amazon.awscdk.services.gameliftstreams.CfnStreamGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStreamGroup(
  id: String,
  props: CfnStreamGroupProps,
  initializer: @AwsCdkDsl CfnStreamGroup.() -> Unit = {},
): CfnStreamGroup = CfnStreamGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStreamGroup(id: String, initializer: @AwsCdkDsl
    CfnStreamGroup.Builder.() -> Unit = {}): CfnStreamGroup = CfnStreamGroup.Builder.create(this,
    id).apply(initializer).build()
