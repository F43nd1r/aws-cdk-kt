package com.faendir.awscdkkt.services.groundstation

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
  initializer: CfnMissionProfile.() -> Unit = {},
): CfnMissionProfile = CfnMissionProfile(this, id, props).apply(initializer)
