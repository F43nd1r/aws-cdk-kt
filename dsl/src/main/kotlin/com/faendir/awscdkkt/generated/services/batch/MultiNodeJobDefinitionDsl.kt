package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.MultiNodeJobDefinition
import software.amazon.awscdk.services.batch.MultiNodeJobDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.multiNodeJobDefinition(id: String, initializer: @AwsCdkDsl
    MultiNodeJobDefinition.() -> Unit = {}): MultiNodeJobDefinition = MultiNodeJobDefinition(this,
    id).apply(initializer)

@Generated
public fun Construct.multiNodeJobDefinition(
  id: String,
  props: MultiNodeJobDefinitionProps,
  initializer: @AwsCdkDsl MultiNodeJobDefinition.() -> Unit = {},
): MultiNodeJobDefinition = MultiNodeJobDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildMultiNodeJobDefinition(id: String, initializer: @AwsCdkDsl
    MultiNodeJobDefinition.Builder.() -> Unit = {}): MultiNodeJobDefinition =
    MultiNodeJobDefinition.Builder.create(this, id).apply(initializer).build()
