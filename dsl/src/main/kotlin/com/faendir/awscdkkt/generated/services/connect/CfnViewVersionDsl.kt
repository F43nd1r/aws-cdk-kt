package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnViewVersion
import software.amazon.awscdk.services.connect.CfnViewVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnViewVersion(
  id: String,
  props: CfnViewVersionProps,
  initializer: @AwsCdkDsl CfnViewVersion.() -> Unit = {},
): CfnViewVersion = CfnViewVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnViewVersion(id: String, initializer: @AwsCdkDsl CfnViewVersion.Builder.() -> Unit = {}): CfnViewVersion = CfnViewVersion.Builder.create(this, id).apply(initializer).build()
