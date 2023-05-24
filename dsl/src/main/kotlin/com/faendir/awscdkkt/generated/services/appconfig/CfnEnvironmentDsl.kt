package com.faendir.awscdkkt.generated.services.appconfig

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnEnvironment
import software.amazon.awscdk.services.appconfig.CfnEnvironmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEnvironment(id: String, props: CfnEnvironmentProps): CfnEnvironment =
    CfnEnvironment(this, id, props)

@Generated
public fun Construct.cfnEnvironment(
  id: String,
  props: CfnEnvironmentProps,
  initializer: @AwsCdkDsl CfnEnvironment.() -> Unit,
): CfnEnvironment = CfnEnvironment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEnvironment(id: String, initializer: @AwsCdkDsl
    CfnEnvironment.Builder.() -> Unit): CfnEnvironment = CfnEnvironment.Builder.create(this,
    id).apply(initializer).build()
