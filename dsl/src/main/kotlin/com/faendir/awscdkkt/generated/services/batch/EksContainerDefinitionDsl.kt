package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.EksContainerDefinition
import software.amazon.awscdk.services.batch.EksContainerDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.eksContainerDefinition(
  id: String,
  props: EksContainerDefinitionProps,
  initializer: @AwsCdkDsl EksContainerDefinition.() -> Unit = {},
): EksContainerDefinition = EksContainerDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEksContainerDefinition(id: String, initializer: @AwsCdkDsl
    EksContainerDefinition.Builder.() -> Unit = {}): EksContainerDefinition =
    EksContainerDefinition.Builder.create(this, id).apply(initializer).build()
