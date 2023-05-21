package com.faendir.awscdkkt.services.elasticbeanstalk

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplication
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApplication(id: String, initializer: CfnApplication.() -> Unit = {}):
    CfnApplication = CfnApplication(this, id).apply(initializer)

@Generated
public fun Construct.cfnApplication(
  id: String,
  props: CfnApplicationProps,
  initializer: CfnApplication.() -> Unit = {},
): CfnApplication = CfnApplication(this, id, props).apply(initializer)
