package com.faendir.awscdkkt.generated.services.gameliftstreams

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gameliftstreams.CfnApplication
import software.amazon.awscdk.services.gameliftstreams.CfnApplicationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApplication(
  id: String,
  props: CfnApplicationProps,
  initializer: @AwsCdkDsl CfnApplication.() -> Unit = {},
): CfnApplication = CfnApplication(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApplication(id: String, initializer: @AwsCdkDsl
    CfnApplication.Builder.() -> Unit = {}): CfnApplication = CfnApplication.Builder.create(this,
    id).apply(initializer).build()
