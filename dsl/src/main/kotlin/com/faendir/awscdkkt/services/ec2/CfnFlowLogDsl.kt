package com.faendir.awscdkkt.services.ec2

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
  initializer: CfnFlowLog.() -> Unit = {},
): CfnFlowLog = CfnFlowLog(this, id, props).apply(initializer)
