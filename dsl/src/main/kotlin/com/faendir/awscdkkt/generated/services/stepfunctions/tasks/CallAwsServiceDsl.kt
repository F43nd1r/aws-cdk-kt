package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.CallAwsService
import software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceProps
import software.constructs.Construct

@Generated
public fun Construct.callAwsService(
  id: String,
  props: CallAwsServiceProps,
  initializer: @AwsCdkDsl CallAwsService.() -> Unit = {},
): CallAwsService = CallAwsService(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCallAwsService(id: String, initializer: @AwsCdkDsl
    CallAwsService.Builder.() -> Unit = {}): CallAwsService = CallAwsService.Builder.create(this,
    id).apply(initializer).build()
