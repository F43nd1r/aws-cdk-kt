package com.faendir.awscdkkt.generated.services.datazone

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datazone.CfnEnvironmentProfile
import software.amazon.awscdk.services.datazone.CfnEnvironmentProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEnvironmentProfile(
  id: String,
  props: CfnEnvironmentProfileProps,
  initializer: @AwsCdkDsl CfnEnvironmentProfile.() -> Unit = {},
): CfnEnvironmentProfile = CfnEnvironmentProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEnvironmentProfile(id: String, initializer: @AwsCdkDsl CfnEnvironmentProfile.Builder.() -> Unit = {}): CfnEnvironmentProfile = CfnEnvironmentProfile.Builder.create(this, id).apply(initializer).build()
