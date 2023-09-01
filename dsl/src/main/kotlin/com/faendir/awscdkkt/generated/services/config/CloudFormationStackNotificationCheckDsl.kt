package com.faendir.awscdkkt.generated.services.config

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck
import software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps
import software.constructs.Construct

@Generated
public fun Construct.cloudFormationStackNotificationCheck(id: String, initializer: @AwsCdkDsl
    CloudFormationStackNotificationCheck.() -> Unit = {}): CloudFormationStackNotificationCheck =
    CloudFormationStackNotificationCheck(this, id).apply(initializer)

@Generated
public fun Construct.cloudFormationStackNotificationCheck(
  id: String,
  props: CloudFormationStackNotificationCheckProps,
  initializer: @AwsCdkDsl CloudFormationStackNotificationCheck.() -> Unit = {},
): CloudFormationStackNotificationCheck = CloudFormationStackNotificationCheck(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCloudFormationStackNotificationCheck(id: String, initializer: @AwsCdkDsl
    CloudFormationStackNotificationCheck.Builder.() -> Unit = {}):
    CloudFormationStackNotificationCheck = CloudFormationStackNotificationCheck.Builder.create(this,
    id).apply(initializer).build()
