package com.faendir.awscdkkt.generated.services.datazone

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datazone.CfnProjectProfile
import software.amazon.awscdk.services.datazone.CfnProjectProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnProjectProfile(
  id: String,
  props: CfnProjectProfileProps,
  initializer: @AwsCdkDsl CfnProjectProfile.() -> Unit = {},
): CfnProjectProfile = CfnProjectProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnProjectProfile(id: String, initializer: @AwsCdkDsl
    CfnProjectProfile.Builder.() -> Unit = {}): CfnProjectProfile =
    CfnProjectProfile.Builder.create(this, id).apply(initializer).build()
