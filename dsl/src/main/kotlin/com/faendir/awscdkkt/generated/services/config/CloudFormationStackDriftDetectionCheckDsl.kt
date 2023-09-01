package com.faendir.awscdkkt.generated.services.config

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheck
import software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps
import software.constructs.Construct

@Generated
public fun Construct.cloudFormationStackDriftDetectionCheck(id: String, initializer: @AwsCdkDsl
    CloudFormationStackDriftDetectionCheck.() -> Unit = {}): CloudFormationStackDriftDetectionCheck
    = CloudFormationStackDriftDetectionCheck(this, id).apply(initializer)

@Generated
public fun Construct.cloudFormationStackDriftDetectionCheck(
  id: String,
  props: CloudFormationStackDriftDetectionCheckProps,
  initializer: @AwsCdkDsl CloudFormationStackDriftDetectionCheck.() -> Unit = {},
): CloudFormationStackDriftDetectionCheck = CloudFormationStackDriftDetectionCheck(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCloudFormationStackDriftDetectionCheck(id: String, initializer: @AwsCdkDsl
    CloudFormationStackDriftDetectionCheck.Builder.() -> Unit = {}):
    CloudFormationStackDriftDetectionCheck =
    CloudFormationStackDriftDetectionCheck.Builder.create(this, id).apply(initializer).build()
