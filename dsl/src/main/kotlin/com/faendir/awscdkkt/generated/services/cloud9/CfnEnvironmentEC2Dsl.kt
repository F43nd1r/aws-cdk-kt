package com.faendir.awscdkkt.generated.services.cloud9

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2
import software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props
import software.constructs.Construct

@Generated
public fun Construct.cfnEnvironmentEC2(
  id: String,
  props: CfnEnvironmentEC2Props,
  initializer: @AwsCdkDsl CfnEnvironmentEC2.() -> Unit = {},
): CfnEnvironmentEC2 = CfnEnvironmentEC2(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEnvironmentEC2(id: String, initializer: @AwsCdkDsl CfnEnvironmentEC2.Builder.() -> Unit = {}): CfnEnvironmentEC2 = CfnEnvironmentEC2.Builder.create(this, id).apply(initializer).build()
