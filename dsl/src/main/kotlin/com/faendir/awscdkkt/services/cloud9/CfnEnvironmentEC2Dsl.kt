@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloud9

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2
import software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props
import software.constructs.Construct

public fun Construct.cfnEnvironmentEC2(
  id: String,
  props: CfnEnvironmentEC2Props,
  initializer: CfnEnvironmentEC2.() -> Unit = {},
): CfnEnvironmentEC2 = CfnEnvironmentEC2(this, id, props).apply(initializer)
