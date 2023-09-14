package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.MultiNodeContainer

@Generated
public fun buildMultiNodeContainer(initializer: @AwsCdkDsl MultiNodeContainer.Builder.() -> Unit =
    {}): MultiNodeContainer = MultiNodeContainer.Builder().apply(initializer).build()
