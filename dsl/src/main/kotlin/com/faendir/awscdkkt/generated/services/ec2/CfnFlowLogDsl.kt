package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnFlowLog
import software.amazon.awscdk.services.ec2.CfnFlowLogProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFlowLog(
  id: String,
  props: CfnFlowLogProps,
  initializer: @AwsCdkDsl CfnFlowLog.() -> Unit = {},
): CfnFlowLog = CfnFlowLog(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFlowLog(id: String, initializer: @AwsCdkDsl
    CfnFlowLog.Builder.() -> Unit = {}): CfnFlowLog = CfnFlowLog.Builder.create(this,
    id).apply(initializer).build()
