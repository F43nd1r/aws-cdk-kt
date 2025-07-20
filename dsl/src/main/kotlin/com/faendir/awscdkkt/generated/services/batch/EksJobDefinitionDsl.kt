package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.EksJobDefinition
import software.amazon.awscdk.services.batch.EksJobDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.eksJobDefinition(
  id: String,
  props: EksJobDefinitionProps,
  initializer: @AwsCdkDsl EksJobDefinition.() -> Unit = {},
): EksJobDefinition = EksJobDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEksJobDefinition(id: String, initializer: @AwsCdkDsl EksJobDefinition.Builder.() -> Unit = {}): EksJobDefinition = EksJobDefinition.Builder.create(this, id).apply(initializer).build()
