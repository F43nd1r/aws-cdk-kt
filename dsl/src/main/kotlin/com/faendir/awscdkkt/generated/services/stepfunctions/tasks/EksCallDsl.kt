package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EksCall
import software.amazon.awscdk.services.stepfunctions.tasks.EksCallProps
import software.constructs.Construct

@Generated
public fun Construct.eksCall(
  id: String,
  props: EksCallProps,
  initializer: @AwsCdkDsl EksCall.() -> Unit = {},
): EksCall = EksCall(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEksCall(id: String, initializer: @AwsCdkDsl EksCall.Builder.() -> Unit = {}): EksCall = EksCall.Builder.create(this, id).apply(initializer).build()
