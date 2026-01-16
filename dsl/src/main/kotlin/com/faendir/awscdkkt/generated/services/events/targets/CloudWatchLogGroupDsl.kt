package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.interfaces.logs.ILogGroupRef
import software.amazon.awscdk.services.events.targets.CloudWatchLogGroup

@Generated
public fun buildCloudWatchLogGroup(logGroup: ILogGroupRef, initializer: @AwsCdkDsl CloudWatchLogGroup.Builder.() -> Unit = {}): CloudWatchLogGroup = CloudWatchLogGroup.Builder.create(logGroup).apply(initializer).build()
