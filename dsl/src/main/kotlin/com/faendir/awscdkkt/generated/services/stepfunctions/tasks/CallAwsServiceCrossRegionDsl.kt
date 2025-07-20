package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceCrossRegion
import software.amazon.awscdk.services.stepfunctions.tasks.CallAwsServiceCrossRegionProps
import software.constructs.Construct

@Generated
public fun Construct.callAwsServiceCrossRegion(
  id: String,
  props: CallAwsServiceCrossRegionProps,
  initializer: @AwsCdkDsl CallAwsServiceCrossRegion.() -> Unit = {},
): CallAwsServiceCrossRegion = CallAwsServiceCrossRegion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCallAwsServiceCrossRegion(id: String, initializer: @AwsCdkDsl CallAwsServiceCrossRegion.Builder.() -> Unit = {}): CallAwsServiceCrossRegion = CallAwsServiceCrossRegion.Builder.create(this, id).apply(initializer).build()
