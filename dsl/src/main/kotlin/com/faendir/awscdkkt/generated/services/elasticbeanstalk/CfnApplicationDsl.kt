package com.faendir.awscdkkt.generated.services.elasticbeanstalk

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplication
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApplication(id: String): CfnApplication = CfnApplication(this, id)

@Generated
public fun Construct.cfnApplication(id: String, initializer: @AwsCdkDsl CfnApplication.() -> Unit):
    CfnApplication = CfnApplication(this, id).apply(initializer)

@Generated
public fun Construct.cfnApplication(id: String, props: CfnApplicationProps): CfnApplication =
    CfnApplication(this, id, props)

@Generated
public fun Construct.cfnApplication(
  id: String,
  props: CfnApplicationProps,
  initializer: @AwsCdkDsl CfnApplication.() -> Unit,
): CfnApplication = CfnApplication(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApplication(id: String, initializer: @AwsCdkDsl
    CfnApplication.Builder.() -> Unit): CfnApplication = CfnApplication.Builder.create(this,
    id).apply(initializer).build()
