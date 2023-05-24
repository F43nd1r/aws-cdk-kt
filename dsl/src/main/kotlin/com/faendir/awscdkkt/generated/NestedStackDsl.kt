package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.NestedStack
import software.amazon.awscdk.NestedStackProps
import software.constructs.Construct

@Generated
public fun Construct.nestedStack(id: String): NestedStack = NestedStack(this, id)

@Generated
public fun Construct.nestedStack(id: String, initializer: @AwsCdkDsl NestedStack.() -> Unit):
    NestedStack = NestedStack(this, id).apply(initializer)

@Generated
public fun Construct.nestedStack(id: String, props: NestedStackProps): NestedStack =
    NestedStack(this, id, props)

@Generated
public fun Construct.nestedStack(
  id: String,
  props: NestedStackProps,
  initializer: @AwsCdkDsl NestedStack.() -> Unit,
): NestedStack = NestedStack(this, id, props).apply(initializer)

@Generated
public fun Construct.buildNestedStack(id: String, initializer: @AwsCdkDsl
    NestedStack.Builder.() -> Unit): NestedStack = NestedStack.Builder.create(this,
    id).apply(initializer).build()
