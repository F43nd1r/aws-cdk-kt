package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.Share

@Generated
public fun buildShare(initializer: @AwsCdkDsl Share.Builder.() -> Unit = {}): Share =
    Share.Builder().apply(initializer).build()
