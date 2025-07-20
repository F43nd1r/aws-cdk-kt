package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.EcsFargateContainerDefinition
import software.amazon.awscdk.services.batch.EcsFargateContainerDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.ecsFargateContainerDefinition(
  id: String,
  props: EcsFargateContainerDefinitionProps,
  initializer: @AwsCdkDsl EcsFargateContainerDefinition.() -> Unit = {},
): EcsFargateContainerDefinition = EcsFargateContainerDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEcsFargateContainerDefinition(id: String, initializer: @AwsCdkDsl EcsFargateContainerDefinition.Builder.() -> Unit = {}): EcsFargateContainerDefinition = EcsFargateContainerDefinition.Builder.create(this, id).apply(initializer).build()
