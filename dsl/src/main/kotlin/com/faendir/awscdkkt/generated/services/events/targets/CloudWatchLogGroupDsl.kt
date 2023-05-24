package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.CloudWatchLogGroup
import software.amazon.awscdk.services.events.targets.LogGroupProps
import software.amazon.awscdk.services.logs.ILogGroup

@Generated
public fun cloudWatchLogGroup(logGroup: ILogGroup): CloudWatchLogGroup =
    CloudWatchLogGroup(logGroup)

@Generated
public fun cloudWatchLogGroup(logGroup: ILogGroup, props: LogGroupProps): CloudWatchLogGroup =
    CloudWatchLogGroup(logGroup, props)

@Generated
public fun buildCloudWatchLogGroup(logGroup: ILogGroup, initializer: @AwsCdkDsl
    CloudWatchLogGroup.Builder.() -> Unit): CloudWatchLogGroup =
    CloudWatchLogGroup.Builder.create(logGroup).apply(initializer).build()
