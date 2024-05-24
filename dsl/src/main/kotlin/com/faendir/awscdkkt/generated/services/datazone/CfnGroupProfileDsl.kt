package com.faendir.awscdkkt.generated.services.datazone

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datazone.CfnGroupProfile
import software.amazon.awscdk.services.datazone.CfnGroupProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGroupProfile(
  id: String,
  props: CfnGroupProfileProps,
  initializer: @AwsCdkDsl CfnGroupProfile.() -> Unit = {},
): CfnGroupProfile = CfnGroupProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGroupProfile(id: String, initializer: @AwsCdkDsl
    CfnGroupProfile.Builder.() -> Unit = {}): CfnGroupProfile = CfnGroupProfile.Builder.create(this,
    id).apply(initializer).build()
