package com.faendir.awscdkkt.services.stepfunctions.tasks

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
  initializer: CallAwsService.() -> Unit = {},
): CallAwsService = CallAwsService(this, id, props).apply(initializer)
