package com.faendir.awscdkkt.generated.services.arczonalshift

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.arczonalshift.CfnAutoshiftObserverNotificationStatus
import software.amazon.awscdk.services.arczonalshift.CfnAutoshiftObserverNotificationStatusProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAutoshiftObserverNotificationStatus(
  id: String,
  props: CfnAutoshiftObserverNotificationStatusProps,
  initializer: @AwsCdkDsl CfnAutoshiftObserverNotificationStatus.() -> Unit = {},
): CfnAutoshiftObserverNotificationStatus = CfnAutoshiftObserverNotificationStatus(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAutoshiftObserverNotificationStatus(id: String, initializer: @AwsCdkDsl CfnAutoshiftObserverNotificationStatus.Builder.() -> Unit = {}): CfnAutoshiftObserverNotificationStatus = CfnAutoshiftObserverNotificationStatus.Builder.create(this, id).apply(initializer).build()
