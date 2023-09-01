package com.faendir.awscdkkt.generated.services.lookoutmetrics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert
import software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAlert(
  id: String,
  props: CfnAlertProps,
  initializer: @AwsCdkDsl CfnAlert.() -> Unit = {},
): CfnAlert = CfnAlert(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAlert(id: String, initializer: @AwsCdkDsl CfnAlert.Builder.() -> Unit =
    {}): CfnAlert = CfnAlert.Builder.create(this, id).apply(initializer).build()
