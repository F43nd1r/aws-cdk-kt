package com.faendir.awscdkkt.generated.services.gamelift

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition
import software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnContainerGroupDefinition(
  id: String,
  props: CfnContainerGroupDefinitionProps,
  initializer: @AwsCdkDsl CfnContainerGroupDefinition.() -> Unit = {},
): CfnContainerGroupDefinition = CfnContainerGroupDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnContainerGroupDefinition(id: String, initializer: @AwsCdkDsl
    CfnContainerGroupDefinition.Builder.() -> Unit = {}): CfnContainerGroupDefinition =
    CfnContainerGroupDefinition.Builder.create(this, id).apply(initializer).build()
