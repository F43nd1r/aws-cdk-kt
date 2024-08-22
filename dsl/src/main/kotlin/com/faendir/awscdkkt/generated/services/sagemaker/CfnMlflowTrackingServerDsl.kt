package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnMlflowTrackingServer
import software.amazon.awscdk.services.sagemaker.CfnMlflowTrackingServerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMlflowTrackingServer(
  id: String,
  props: CfnMlflowTrackingServerProps,
  initializer: @AwsCdkDsl CfnMlflowTrackingServer.() -> Unit = {},
): CfnMlflowTrackingServer = CfnMlflowTrackingServer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMlflowTrackingServer(id: String, initializer: @AwsCdkDsl
    CfnMlflowTrackingServer.Builder.() -> Unit = {}): CfnMlflowTrackingServer =
    CfnMlflowTrackingServer.Builder.create(this, id).apply(initializer).build()
