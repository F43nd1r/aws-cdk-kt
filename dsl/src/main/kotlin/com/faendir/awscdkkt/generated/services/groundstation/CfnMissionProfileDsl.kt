package com.faendir.awscdkkt.generated.services.groundstation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.groundstation.CfnMissionProfile
import software.amazon.awscdk.services.groundstation.CfnMissionProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMissionProfile(
  id: String,
  props: CfnMissionProfileProps,
  initializer: @AwsCdkDsl CfnMissionProfile.() -> Unit = {},
): CfnMissionProfile = CfnMissionProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMissionProfile(id: String, initializer: @AwsCdkDsl CfnMissionProfile.Builder.() -> Unit = {}): CfnMissionProfile = CfnMissionProfile.Builder.create(this, id).apply(initializer).build()
