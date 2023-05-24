package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Pass
import software.amazon.awscdk.services.stepfunctions.PassProps
import software.constructs.Construct

@Generated
public fun Construct.pass(id: String): Pass = Pass(this, id)

@Generated
public fun Construct.pass(id: String, initializer: @AwsCdkDsl Pass.() -> Unit): Pass = Pass(this,
    id).apply(initializer)

@Generated
public fun Construct.pass(id: String, props: PassProps): Pass = Pass(this, id, props)

@Generated
public fun Construct.pass(
  id: String,
  props: PassProps,
  initializer: @AwsCdkDsl Pass.() -> Unit,
): Pass = Pass(this, id, props).apply(initializer)

@Generated
public fun Construct.buildPass(id: String, initializer: @AwsCdkDsl Pass.Builder.() -> Unit): Pass =
    Pass.Builder.create(this, id).apply(initializer).build()
