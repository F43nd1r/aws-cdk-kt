package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnHoursOfOperation
import software.amazon.awscdk.services.connect.CfnHoursOfOperationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHoursOfOperation(
  id: String,
  props: CfnHoursOfOperationProps,
  initializer: @AwsCdkDsl CfnHoursOfOperation.() -> Unit = {},
): CfnHoursOfOperation = CfnHoursOfOperation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHoursOfOperation(id: String, initializer: @AwsCdkDsl
    CfnHoursOfOperation.Builder.() -> Unit = {}): CfnHoursOfOperation =
    CfnHoursOfOperation.Builder.create(this, id).apply(initializer).build()
